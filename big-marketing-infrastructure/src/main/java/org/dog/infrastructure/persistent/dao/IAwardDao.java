package org.dog.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.dog.infrastructure.persistent.po.Award;

import java.util.List;

/**
 * @Author: Odin
 * @Date: 2024/5/12 13:48
 * @Description:
 */

@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

}
