package de.dc.sql.lang.demo;

@SuppressWarnings("all")
public class PersonQuery {
  public static String findAllByName(final String name) {
    StringBuilder sb = new StringBuilder();
    sb.append(" ");
    sb.append("SELECT * FROM person ");
    sb.append("WHERE name='<name>' ");
    sb.append(" ");
    String content = sb.toString();
    content = content.replaceAll("<name>", String.valueOf(name));
    return content.trim();
  }
  
  public static String findAllByForename(final String forename) {
    StringBuilder sb = new StringBuilder();
    sb.append(" ");
    sb.append("SELECT * FROM person ");
    sb.append("WHERE forename='<forename>' ");
    sb.append(" ");
    String content = sb.toString();
    content = content.replaceAll("<forename>", String.valueOf(forename));
    return content.trim();
  }
  
  public static String findAllById(final String id) {
    StringBuilder sb = new StringBuilder();
    sb.append(" ");
    sb.append("SELECT * FROM person ");
    sb.append("WHERE id='<id>' ");
    sb.append(" ");
    String content = sb.toString();
    content = content.replaceAll("<id>", String.valueOf(id));
    return content.trim();
  }
}
