package jp.co.sss.lms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.sss.lms.dto.UserDetailDto;

/**
 * LMSユーザーマスタマッパー
 * 
 * @author 東京ITスクール
 */
@Mapper
public interface MLmsUserMapper {

	/**
	 * ユーザー基本情報取得
	 * 
	 * @param lmsUserId
	 * @param deleteFlg
	 * @return ユーザー基本情報DTO
	 */
	UserDetailDto getUserDetail(@Param("lmsUserId") Integer lmsUserId,
			@Param("deleteFlg") Short deleteFlg);

}
