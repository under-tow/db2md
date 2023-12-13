import bean.DbModel;
import config.DataSource;
import config.DbFinder;
import config.Freemarker;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Run {

    public static void main(String[] args) throws SQLException, TemplateException, IOException {
        Connection connection = DataSource.getConnection();
        DbModel model = DbFinder.tables(connection);
        Freemarker freemarker = new Freemarker();
        freemarker.produce(model);
    }
}
