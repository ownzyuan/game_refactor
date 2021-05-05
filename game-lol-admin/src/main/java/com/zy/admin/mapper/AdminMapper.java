package com.zy.admin.mapper;

import com.zy.common.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminMapper {

    Admin query(String username);

}
