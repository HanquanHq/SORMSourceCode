# SORMSourceCode
一个简单的手写SORM框架，Java+MySQL，增删改查，根据表信息自动生成javabean

### 更详细的说明：https://blog.csdn.net/sinat_42483341/article/details/99422163

一个简单的手写SORM框架，Java+MySQL，增删改查，根据表信息自动生成JavaBean。

使用时，需要配置src下的db.properties文件，改成自己的数据库名称、路径。配置示例：

```
driver=com.mysql.cj.jdbc.Driver                               //数据库驱动
url=jdbc\:mysql\://localhost\:3306/sorm?serverTimezone=UTC    //数据库url
user=root                                                     //用户名
pwd=123456                                                    //密码
usingDB=mysql                                                 //mysq（能用）还是oracle（未测试）
srcPath=C:/Users/Bug/eclipse-workspace3/SORMSourceCode/src    //项目路径 用于根据数据库表名称生成javabrean
poPackage=com.bjsxt.po                                        //自动生成的javabean保存的包（若不存在，则自动创建）
queryClass=com.bjsxt.sorm.core.MySqlQuery                     //执行查询的类名称（不一定是mysql，可能是其他数据库，其他数据库需要自己实现类）
poolMinSize=10                                                //连接池的最小连接数
poolMaxSize=100                                               //连接池的最大连接数
```

#### 注意
1. 在src下建立db.properties，填写相关内容。
2. 第一次使用时，先运行JavaFileUtils.java，根据数据库表信息生成java文件，才能正常做一些测试。
3. 每张表目前仅支持一个主键。不能处理多个主键的情况。
4. po尽量使用包装类，不要使用基本数据类型。

几乎每个.java文件都有自己的main测试方法，文件名见名知意，比如MySQLQuery是用来执行SQL语句的。就不多解释啦。

