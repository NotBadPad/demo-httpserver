test-httpserver
===============
easy-httpserver的测试项目，可将easy-httpserver打包后引入该项目使用。

项目结构
===============
<p>~src/main/java<br />　　com.gj.web.controller<br />　　　　JsonController.java &nbsp; &nbsp;返回json测试controller<br />　　　　UpFileController.java &nbsp; 上传文件测试controller&nbsp; &nbsp;&nbsp;<br />　　　　VelocityController.java &nbsp; 通过Velocity渲染返回页面数据测试controller<br />~src/main/resources<br />　　velocity.properties &nbsp; velocity配置文件，可不配置（会加载easy-httpserver中的配置文件）<br />　　web.properties &nbsp; &nbsp;项目配置文件，具体配置见其内注释<br />~src/main/view<br />　　page　　<br />　　　　myinfo.page　　旧的测试页面<br />　　　　myvm.vm　　velocity页面<br />　　static<br />　　　　css、js、pic &nbsp; 不解释，你懂的<br />　　　　page　　静态页面，可直接访问，后缀为html</p>
