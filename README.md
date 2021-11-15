# hiveserver2-custom-auth


## 自定义验证(使用用户名和密码访问)

下载自定义验证jar包并放置于`${HIVE_HOME}/lib`下
```
curl -LO https://github.com/ixre/hiveserver2-custom-auth/raw/master/hive-server2-simple-auth-1.0.jar　
mv hive-server2-simple-aut-1.0.jar ${HIVE_HOME}/lib
```
编译`conf/hive-site.xml`加入以下行
```
<property>
 	<name>hive.server2.authentication</name>
  <value>CUSTOM</value>
</property>
<property>
  <name>hive.server2.custom.authentication.class</name>
  <value>com.github.ixre.hive.SimpleServer2AuthImpl</value>
</property>
<property>
	<name>hive.server2.custom.authentication.file</name>
	<value>./hive-server2-users.conf</value>
</property>
```
在同级创建用户文件:'hive-server2-users.conf',用户密码格式为:[user],[md5(pwd)]
```
user,5f4dcc3b5aa765d61d8327deb882cf99
```
重启服务生效