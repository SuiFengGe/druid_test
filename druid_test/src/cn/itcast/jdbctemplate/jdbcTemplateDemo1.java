
/*
使用模板需要导入五个包
 */
package cn.itcast.jdbctemplate;
        import cn.itcast.utils.JDBCUtils;
        import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
        import org.springframework.jdbc.core.JdbcTemplate;

/*
jdbcTemplate入门
 */
public class jdbcTemplateDemo1 {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql="update account set balance =5000 where id = ?";
        int count=template.update(sql,3);
        System.out.println(count);
    }

}