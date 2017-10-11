# Mybatis-Template-CodeSmith
Generate Mybatis Mapper Interface, Mapper XML and PO File with CodeSmith

`使用 CodeSmith 生成使用 Mybatis 框架时所需的 Mapper Interface、Mapper XML 和 PO 类文件`

# Use Condition
+ Each table shouid have a primary key (default name is `id`)
+ I develop it with CodeSmith 7.1, so other version I don't known
+ CodeSimth 7.1 still have a problem is `MySQL comment` can't get

# Table Generate Execute Context
#### Execute `/MyBatis/Build/BuildTable.cst`
+ `AuthorName`: As the name mean, default is me Setsuna Jin
+ `CacheEnable`: Whether use Lever2 Cache, default is true
+ `CacheReadOnly`: Lever2 Cache is read only, default is true
+ `CacheType`: Lever2 Cache type, default is `org.mybatis.caches.ehcache.EhcacheCache`, I use ehcache most time
+ `MapperPackage`: Mapper interface's package name, no default value (eg: com.company.mapper)
+ `POPackage`: Persistent object class's package, no default value (eg: com.company.po)
+ `SourceTable`: Use CodeSmith connect your database, and choose the table which you want to generate, no default value
(this may help you: Data Source=172.0.0.1;Port=3306;Database=database;User ID=userid;Password=password;Charset=utf8)
+ `OutputPOClassDirectory`: Persistent object class file save directory, no default value
+ `OutputMapperXMLDirectory`: Mapper XML file save directory, no default value
+ `OutputMapperInterfaceDirectory`: Mapper Interface file save directory, no default value

# Database Generate Execute Context
#### Execute `/MyBatis/Build/BuidDatabase.cst`
#### Only different with `BuidTable.cst` is the `SourceTable` changed to `DataSource`
+ `DataSource`: Choose a database which you want to generate all table once, no default value

# Example Output File
+ `/MyBatis/Admin.java`
+ `/MyBatis/AdminMapper.java`
+ `/MyBatis/AdminMapper.xml`

> About the nativeType convert to JavaType I will develop it late and add it to execute context
