# community
community项目启动

[ OAuth documentation](https://docs.github.com/en/developers/apps/authorizing-oauth-apps)

运行 migrate 和 generator 的命令
```shell script
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```