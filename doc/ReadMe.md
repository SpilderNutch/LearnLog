#工作学习记录

##1，logback、log4j学习。

###遇到的问题：
* 使用log4j和使用slf4j，明显slf4j会设定logger出错。


##2，学些Mybatis应用
* 2018年10月27日15:29:42，直接引入Mybatis与MySQL直接用.
* HotelController包含了简单粗暴的引用。
* 个人比较喜欢XML配置形式，能够比较简单的配置出现相关查询条件。
* 喜欢session.getMapper形式，比Blog blog = (Blog) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);更加
易读。
* 不使用XML配置，同样可以在mapperJAVA文件中@SELECT,使用注解的方式进行数据获取。
* 使用注解时，必须数据库中字段与实体之间字段相同，否则无法转化。
*  SqlSessionFactoryBuilder这个类可以被实例化、使用和丢弃，一旦创建了 SqlSessionFactory，就不再需要它了。因此 SqlSessionFactoryBuilder 实例的最佳作用域是方法作用域（也就是局部方法变量）。你可以重用 SqlSessionFactoryBuilder 来创建多个 SqlSessionFactory 实例，但是最好还是不要让其一直存在以保证所有的 XML 解析资源开放给更重要的事情。
* SqlSessionFactory一旦被创建就应该在应用的运行期间一直存在，没有任何理由对它进行清除或重建。使用 SqlSessionFactory 的最佳实践是在应用运行期间不要重复创建多次，多次重建 SqlSessionFactory 被视为一种代码“坏味道（bad smell）”。因此 SqlSessionFactory 的最佳作用域是应用作用域。有很多方法可以做到，最简单的就是使用单例模式或者静态单例模式。
* 绝对不能将 SqlSession 实例的引用放在一个类的静态域，甚至一个类的实例变量也不行。也绝不能将 SqlSession 实例的引用放在任何类型的管理作用域中，比如 Servlet 架构中的 HttpSession。如果你现在正在使用一种 Web 框架，要考虑 SqlSession 放在一个和 HTTP 请求对象相似的作用域中。换句话说，每次收到的 HTTP 请求，就可以打开一个 SqlSession，返回一个响应，就关闭它。这个关闭操作是很重要的，你应该把这个关闭操作放到 finally 块中以确保每次都能执行关闭。