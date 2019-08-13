package com.bjsxt.test;

import java.util.List;

import com.bjsxt.sorm.core.MySqlQuery;
import com.bjsxt.sorm.core.Query;
import com.bjsxt.sorm.core.QueryFactory;
import com.bjsxt.vo.EmpVO;

/**
 * 用于测试的类
 * 
 * @author Buuug
 *
 */
@SuppressWarnings("all")
public class Test {
	public static void main(String[] args) {
		Query q = QueryFactory.createQuery();
		// 复杂查询 查询多行
		String sql2 = "select e.id,e.empname,salary,bonus,salary+bonus 'money',age,d.dname 'deptName',d.address 'deptAddr' from emp e join dept d on e.deptId=d.id";
		List<EmpVO> list2 = new MySqlQuery().queryRows(sql2, EmpVO.class, null);

		for (EmpVO e : list2) {
			System.out.println(e.toString());
		}
	}
}
