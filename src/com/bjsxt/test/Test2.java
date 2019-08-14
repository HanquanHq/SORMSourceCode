package com.bjsxt.test;

import java.util.ArrayList;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import com.bjsxt.po.Emp;
import com.bjsxt.sorm.core.MySqlQuery;
import com.bjsxt.sorm.core.Query;
import com.bjsxt.sorm.core.QueryFactory;
import com.bjsxt.vo.EmpVO;

/**
 * 测试连接池的调用
 * 
 * @author Buuug
 *
 */
@SuppressWarnings("all")
public class Test2 {
	public static void test01() {
		Query q = QueryFactory.createQuery();
		String sql2 = "select e.id,e.empname,salary,bonus,salary+bonus 'money',age,d.dname 'deptName',d.address 'deptAddr' from emp e join dept d on e.deptId=d.id";
		List<EmpVO> list2 = new MySqlQuery().queryRows(sql2, EmpVO.class, null);
		for (EmpVO e : list2) {
			System.out.println(e.toString());
		}
	}

	public static void select02() {
		Query q = QueryFactory.createQuery();
		List<Emp> list = new ArrayList<Emp>();
		System.out.println(q.queryUniqueRow("select * from emp where id>?", Emp.class, new Object[] { 2 }));
	}

	public static void main(String[] args) {
		//test01();
select02();
	}
}
