package Unit;

import sql_Connection.SqlConnect;

public class test {
	public static void main(String[] args) {
		if(SqlConnect.getConnection() == null) {
			System.out.println("链接失败！！！");
		} 
		else {
			System.out.println("Congratulation!!!链接成功。");
		}
	}
}
