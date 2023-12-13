import bean.ColumnModel;
import bean.DbModel;
import bean.TableModel;
import config.DataSource;
import config.DbQuery;
import config.Freemarker;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Run {

    public static void main(String[] args) throws SQLException, TemplateException, IOException, NoSuchFieldException, IllegalAccessException {
        Connection connection = DataSource.getConnection();
        DbModel model = DbQuery.tables(connection);
        Freemarker freemarker = new Freemarker();
        freemarker.produce(model);

    }
}
