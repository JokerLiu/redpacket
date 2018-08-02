package cn.lynnjy.demo.controller;


import cn.lynnjy.demo.model.LocalMoney;
import cn.lynnjy.demo.util.CacheManage;
import cn.lynnjy.demo.util.ResponseMessage;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "ListUsersController",description = "获取已领红包接口列表接口",position = 4)
@RestController
public class ListUsersController {
    /**
     * 获取已领红包列表
     * @param id
     * @return
     */
    @GetMapping("/pack-list/packet/{id}")
    public JSONObject list(@PathVariable String id){

        //根据id获取本地对象
        LocalMoney localMoney = CacheManage.getFromDatas(id);
        if (localMoney != null)
            return ResponseMessage.list(localMoney);
        else
            return ResponseMessage.error("当前红包数据为空");

    }
}
