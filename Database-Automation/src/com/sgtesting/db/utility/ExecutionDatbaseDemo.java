package com.sgtesting.db.utility;

public class ExecutionDatbaseDemo {

	public static void main(String[] args) {
		
		int rc=DatabaseUtil.getRecords("select * from dept2");
		System.out.println("# of Records :"+rc);

		int cc=DatabaseUtil.getColumnsCount("select * from dept2");
		System.out.println("# of Columns :"+cc);
		
		String val=DatabaseUtil.getColumnData("select * from dept2 where deptno=20", "DNAME");
		System.out.println("Column Data :"+val);
	}

}
