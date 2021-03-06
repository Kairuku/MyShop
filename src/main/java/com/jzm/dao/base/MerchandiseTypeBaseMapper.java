package com.jzm.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jzm.model.MerchandiseType;
import org.springframework.stereotype.Repository;

/**
*  @author zqw
*/
@Repository
public interface MerchandiseTypeBaseMapper {

    int insertMerchandiseType(MerchandiseType object);

    int updateMerchandiseType(MerchandiseType object);

    int update(MerchandiseType.UpdateBuilder object);

    List<MerchandiseType> queryMerchandiseType(MerchandiseType object);

    MerchandiseType queryMerchandiseTypeLimit1(MerchandiseType object);

}