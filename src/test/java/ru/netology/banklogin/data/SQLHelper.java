package ru.netology.banklogin.data;

import lombok.SneakyThrows;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLHelper {
    private static final QueryRunner QUERY_RUNNER = new QueryRunner();

    private SQLHelper() {
    }

    private static Connection getConn() throws SQLException{
        return DriverManager.getConnection(System.getProperty("db.url"), "app", "pass");
    }

    @SneakyThrows

    public static getVerificationCode(){
        var codeSQL = "SELECT code FROM auth_codes ORDER BY created DESC LIMIT 1 ";
        try (var conn = getConn()) {

        }
    }

    @SneakyThrows

    public static void cleanDataBase() {
        try (var conn = getConn()) {
            QUERY_RUNNER.execute(conn, "DELETE FROM auth_codes");
            QUERY_RUNNER.execute(conn, "DELETE FROM" card_transactions);
            QUERY_RUNNER.execute(conn, "DELETE FROM" cards);
            QUERY_RUNNER.execute(conn, "DELETE FROM" users);
        }
    }

    @SneakyThrows

    public static void cleanAuthCode(){
        try (var conn = getConn()){
            QUERY_RUNNER.execute(conn, "DELETE FROM auth_codes");
        }
    }



}
