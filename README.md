


https://demo.lynnjy.cn/send

	post json
		{
			"size":"5",
			"money":"10",
			"sender":"he",
			"wishes":"Merry Christmas!ʥ������",
			"imgUrl":"/hi.jpg"
		}
	
	return 
		{
		  "errcode": 200/500
		  "result": "OK",
		  "errmsg": "OK"
		}

		
https://demo.lynnjy.cn/receive/get

	post json
		{
			"id":"57509cf2-2d34-4220-a168-9cf0c1c515bf",
			"nickname":"user5",
			"imgUrl":"./test/haha.jpg",
			"grabMoney":null,"picUrl":null,
			"beauty":null,
			"happy":null
		}
	
	return
		{
		  "errcode": 200/500
		  "result": "OK",
		  "errmsg": "OK"
		}

https://demo.lynnjy.cn/receive/open

ע�⣺���post��ʱ���п��ܷ���500 
����errcode:500 ��������http status 500 
��ζ�����׳����쳣 Ҳ����ͼƬ��������ʶ���� ����Ҫ��fail������ ���Ե�������ʾ��������ͼƬ


	post json
		{
			"id":"57509cf2-2d34-4220-a168-9cf0c1c515bf",
			"nickname":"user5",
			"imgUrl":"./test/haha.jpg",
			"grabMoney":null,
			"picUrl":"picture-1255478844.cosgz.myqcloud.com/666.jpg",
			"beauty":null,
			"happy":null
		}
	
	return 
		{
		  "errcode": 200/500
		  "result": {
			"happy_rank": "����ɶ�أ�",
			"code": 0,
			"beauty": 81,
			"money": 3.33,
			"beauty_rank": "������ʮ�������ǵ���Ľ����ֱ˧�����",
			"sexAndAge_rank": "�����ഺ�껪���紺�����ţ�����֮�崿��",
			"happy": 11,
			"sex": "female",
			"weight": 0.76,
			"wmoney": 2.53,
			"age": 14
		  },
		  "errmsg": "OK"
		}
		
https://demo.lynnjy.cn/packList

	get �޲���
	
	return
		{
		  "errcode": 200,
		  "result": [{
			"packID": "57509cf2-2d34-4220-a168-9cf0c1c515bf",
			"sender": "he",
			"list": [{
			  "id": null,
			  "nickname": "user5",
			  "imgUrl": "./test/haha.jpg",
			  "grabMoney": 2.53,
			  "picUrl": null
			}],
			"size": 5,
			"wishes": "Merry Christmas!ʥ������",
			"sendTime": "2017-12-11 22:15:03",
			"imgUrl": "/hi.jpg",
			"grabbedSize": 1
		  }, {
			"packID": "f1cb30eb-6604-4740-9491-7ece8fc01885",
			"sender": "he",
			"list": [],
			"size": 5,
			"wishes": "Merry Christmas!ʥ������",
			"sendTime": "2017-12-11 22:10:23",
			"imgUrl": "/hi.jpg",
			"grabbedSize": 0
		  }],
		  "errmsg": "OK"
		}
		
		
		
https://demo.lynnjy.cn/list?id=57509cf2-2d34-4220-a168-9cf0c1c515bf

	get ����id
	
	return 
	
		{
		  "errcode": 200,
		  "size": 5,
		  "sender": "he",
		  "grabbedSize": 1,
		  "money":5,
		  "errmsg": "OK",
		  "grabsList": [{
			"id": null,
			"nickname": "user5",
			"imgUrl": "./test/haha.jpg",
			"grabMoney": 2.53,
			"picUrl": null
		  }],
		  "wishes": "Merry Christmas!ʥ������",
		  "sendTime": "2017-12-11 22:15:03"
		}
	