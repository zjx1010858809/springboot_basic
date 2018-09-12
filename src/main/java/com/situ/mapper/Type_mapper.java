package com.situ.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.situ.model.Type;
import com.situ.utils.SeachInfo;
@Repository(value="Type_mapper")
public interface Type_mapper {
		 @Select("select count(*) from Type  ${where}")
		 public int getSize(SeachInfo where);		
		 @Select("select * from Type")
		 public  List<Type> getAll();
		 
		 @Select("select Type.* from Type   ${where} ${sort} ${limit} ")
		 public  List<Type> getWhere(SeachInfo where);
		 
		 @Insert("insert into Type (sendtype,class_id,title,info,url,operator_id,date,destdate) values(#{sendtype},#{class_id},#{title},#{info},#{url},#{operator_id},#{date},#{destdate})")
		 public Integer insert(Type t);
		 
		 @Delete("delete from Type where id=#{id}")
		 public int delete(int id);
		 
		 @Update("update Type set sendtype=#{sendtype},class_id=#{class_id},title=#{title},info=#{info},url=#{url},destdate=#{destdate} where id=#{id}")
		 public int update(Type t);
		 
		 @Update("update Type set count=count+1 where id=#{id}")
		 public int updatecount(Type t);
		 
		 @Select("select * from Type where Type.id=#{id}")
		 public  Type getByid(int id);
		 
		

}

