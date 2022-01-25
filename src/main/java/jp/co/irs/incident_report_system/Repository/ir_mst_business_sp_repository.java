package jp.co.irs.incident_report_system.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import jp.co.irs.incident_report_system.Entity.ir_mst_business_sp_entity;

public interface ir_mst_business_sp_repository extends JpaRepository<ir_mst_business_sp_entity,String>{
    	//ユーザーIDを一致した情報を検索
	ir_mst_business_sp_entity findByUserId(String userId);

	//ユーザーIDとパスワードが一致したユーザーを検索
	List<ir_mst_business_sp_entity>findByUserIdAndPassword(String userId,String password);
	
	
	//ユーザーIDが一致したユーザーを削除
	void deleteByUserId(String userId);
}
