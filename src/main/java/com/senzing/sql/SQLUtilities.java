package com.senzing.sql;

import java.sql.*;

/**
 * Utilities for using the JDBC API to work with SQL databases.
 */
public class SQLUtilities {
  /**
   * Private constructor.
   */
  private SQLUtilities() {
    // do nothing
  }

  /**
   * Closes the specified {@link Connection} catches and ignores any
   * {@link Exception} and returns <code>null</code> for easy semantics in
   * closing JDBC connections.  If the specified parameter is <code>null</code>
   * then this method does nothing.
   *
   * <pre>
   *   conn = SQLUtilities.close(conn);
   * </pre>
   *
   * @param conn The {@link Connection} to close.
   * @return Always returns <code>null</code>.
   */
  public static Connection close(Connection conn) {
    if (conn == null) return null;
    try {
      if (conn.isClosed()) return null;
      conn.close();
    } catch (Exception e) {
      // ignore
    }
    return null;
  }

  /**
   * Closes the specified {@link Statement} catches and ignores any
   * {@link Exception} and returns <code>null</code> for easy semantics in
   * closing JDBC statements.  If the specified parameter is <code>null</code>
   * then this method does nothing.
   *
   * <pre>
   *   stmt = SQLUtilities.close(stmt);
   * </pre>
   *
   * @param stmt The {@link Statement} to close.
   * @return Always returns <code>null</code>.
   */
  public static Statement close(Statement stmt) {
    if (stmt == null) return null;
    try {
      if (stmt.isClosed()) return null;
      stmt.close();
    } catch (Exception e) {
      // ignore
    }
    return null;
  }

  /**
   * Closes the specified {@link PreparedStatement} catches and ignores
   * any {@link Exception} and returns <code>null</code> for
   * easy semantics in closing JDBC prepared statements.  If the specified
   * parameter is <code>null</code> then this method does nothing.
   *
   * <pre>
   *   ps = SQLUtilities.close(ps);
   * </pre>
   *
   * @param ps The {@link PreparedStatement} to close.
   * @return Always returns <code>null</code>.
   */
  public static PreparedStatement close(PreparedStatement ps) {
    if (ps == null) return null;
    try {
      if (ps.isClosed()) return null;
      ps.close();
    } catch (Exception e) {
      // ignore
    }
    return null;
  }

  /**
   * Closes the specified {@link CallableStatement} catches and ignores
   * any {@link Exception} and returns <code>null</code> for
   * easy semantics in closing JDBC callable statements.  If the specified
   * parameter is <code>null</code> then this method does nothing.
   *
   * <pre>
   *   cs = SQLUtilities.close(cs);
   * </pre>
   *
   * @param cs The {@link CallableStatement} to close.
   * @return Always returns <code>null</code>.
   */
  public static CallableStatement close(CallableStatement cs) {
    if (cs == null) return null;
    try {
      if (cs.isClosed()) return null;
      cs.close();
    } catch (Exception e) {
      // ignore
    }
    return null;
  }

  /**
   * Closes the specified {@link ResultSet} catches and ignores any
   * {@link Exception} and returns <code>null</code> for easy semantics in
   * closing JDBC result sets.  If the specified parameter is <code>null</code>
   * then this method does nothing.
   *
   * <pre>
   *   rs = SQLUtilities.close(rs);
   * </pre>
   *
   * @param rs The {@link ResultSet} to close.
   * @return Always returns <code>null</code>.
   */
  public static ResultSet close(ResultSet rs) {
    if (rs == null) return null;
    try {
      if (rs.isClosed()) return null;
      rs.close();
    } catch (Exception e) {
      // ignore
    }
    return null;
  }
}