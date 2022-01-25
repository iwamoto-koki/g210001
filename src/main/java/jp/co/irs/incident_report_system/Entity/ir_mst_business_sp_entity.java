package jp.co.irs.incident_report_system.Entity;

import lombok.Setter;
import lombok.Getter;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ir_mst_business_sp")

@Setter
@Getter
public class ir_mst_business_sp_entity {
	
	
	//1.ユーザーID
	@Id
	private String userId;
	
	//2.パスワード
	private String password;
	
	//3.権限
	private String authority;
	
	//4.メールアドレス
	private String mail_address;
	
	//5.備考
	private String note;
	
	//6.削除フラグ
	private Integer  is_delete;
	
	//7.データ登録者ID 
	private String data_insert_id;
	
	//8.データ登録日時
	private Timestamp data_insert_date;
	
	//9.データ更新者ID
	private String data_update_id;
	
	//10.データ更新日時
	private Timestamp data_update_date;

	
	
}
