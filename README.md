# game_refactor
​	重构the_game01项目，引入SpringCloud完成微服务架构



# 大致介绍
## 关于架构
game-eureka-server            ------> 注册中心，用于管理各个服务和客户端

game-lol-conmmon             ------> 公共层，用于存储公用类，不属于服务

game-lol-conmmon-base   ------> 公共基础层，用于存储基础类和对象，不属于服务

game-lol-force                      ------> 服务层，提供势力信息的接口服务

game-lol-hero                       ------> 服务层，提供英雄信息的接口服务

game-lol-profession            ------> 服务层，提供职业信息（原Occupation）的接口服务

game-lol-route                     ------> 服务层，提供分路信息的接口服务

game-lol-web                       ------> web层，提供前端可调用的Controller，自身消费服务层，业务逻辑基本都在此



## 启动顺序

game-eureka-server  ---->  game-lol-force、game-lol-hero、game-lol-profession、game-lol-route  ---->   game-lol-web

注册中心（game-eureka-server）必须第一个启动完成，后续服务按需启动即可，最后启动web层



# 测试

由于现在没有前端页面，所以建议通过PostMan测试，部分测试接口如下：

## 服务接口

​	这里只列举hero的接口，其他的只需要修改好端口号、url、body就可以测试了。

​	body都是通过 JSON 字符串传递数据。

### hero

**1.hero/insert（Post请求）**

​	**url**：localhost:8091/api/hero/insert

​	**body**：

​	{

​		 "heroName":"锤石",

  		"designation":"魂锁典狱长",

  		"gender":0,

​		  "forceId":4,

​		  "professionOne":4,

​		  "professionTwo":4,

​		  "routeOne":5,

​		  "routeTwo":5

​	}



**2.hero/update（Post请求）**

​	**url**：localhost:8091/api/hero/update

​	**body**：

​	{

​		 "heroName":"锤石01",

  		"designation":"魂锁典狱长01",

  		"gender":0,

​		  "forceId":4,

​		  "professionOne":4,

​		  "professionTwo":4,

​		  "routeOne":5,

​		  "routeTwo":5

​	}



**3.hero/query**

​	**url**：localhost:8091/api/hero/query

​	**body**：

​	{

​		 "heroName":"锤石",

  		"designation":"魂锁典狱长",

  		"gender":0,

​		  "forceId":4,

​		  "professionOne":4,

​		  "professionTwo":4,

​		  "routeOne":5,

​		  "routeTwo":5

​	}



**4.hero/delete**

​	**url**：localhost:8091/api/hero/delete

​	**body**：33





## controller接口

​	body参考上面的即可

**1.hero/insert**

​	**url**：localhost:8090/lol/hero/insert



**2.hero/query**

​	**url**：localhost:8090/lol/hero/query



**3.hero/update**

​	**url**：localhost:8090/lol/hero/update



**4.hero/delete**

​	**url**：localhost:8090/lol/hero/delete