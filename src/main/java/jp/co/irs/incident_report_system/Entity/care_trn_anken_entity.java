package jp.co.irs.incident_report_system.Entity;




import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Setter;
import lombok.Getter;



@Entity
@Table(name = "care_trn_anken")
@Setter
@Getter
public class care_trn_anken_entity {
	
	//1.ブランド
	private String user_provider_code;
	
	//2.チャネル
	private String channel_sub1;
	
	//3.チャネルサブ
	private String channel_sub2;
	
	//4.CARE案件ID
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "#", name = "#")
	private String case_Id;
	
	//5.CTS案件ID
	private String request_id;
	
	//6.種別
	private String order_type;
	
	//7.種別_詳細
	private String business_line;
	
	//8.登録日付
	private String order_create_date;
	
	//9.登録時間
	private String order_create_time;
	
	//10.個人法人区別名称
	private String kojinkb_name;
	
	//11.カスタマーID
	private String customer_id;
	
	//12.MSN
	private String msn_nbr;
	
	//13.サービスID
	private String service_id;
	
	//14.請求グループID
	private String bill_group_id;
	
	//15.契約者ID
	private String contractor_id;
	
	//16.見込顧客ID
	private String inquiry_id;
	
	//17.SBTM請求グループID
	private String tm_bill_nbr;
	
	//18.課金ID
	private String charge_id;
	
	//19.BLUU駐車場ユーザーID
	private String bluu_parking_user_id;
	
	//20.BLUU駐車場ユーザー区分
	private String acceptance_type;
	
	//21.契約者指名
	private String contractant;
	
	//22.取次店履歴コード
	private String agency_hist_code;
	
	//23.取次店コード
	private String agency_code;
	
	//24.クルーコード
	private String crew_code;
	
	//25.クルー名
	private String crew_name;
	
	//26.SB-ID
	private String softbank_system_id;
	
	//27.キャリアフリーID
	private String cindy_career_free_id;
	
	//28.IVR_スキルコード
	private String ivr_skill_code;
	
	//29.IVR_待ちキュー時刻
	private String ivr_queue_in;
	
	//30.IVR_本確MSN
	private String ivr_msn;
	
	//31.IVR_入電MSN
	private String ivr_ani;
	
	//32.IVR_ブランドID
	private String ivr_brand;
	
	//33.IVR_CALL_ID
	private String ivr_callid;
	
	//34.IVR_通過名
	private String ivr_menu;
	
	//35.IVR_滞在時間
	private String ivr_in_time;
	
	//36.IVR_本人確認結果
	private String check_result;
	
	//37.WT_CONNID
	private String con_id;
	
	//38.CAREカテゴリ
	private String category;
	
	//39.タイプWRAPUP
	private String wrapup;
	
	//40.メモ１
	private String memo_1;
	
	//41.メモ2
	private String memo_2;
		
	//42.メモ3
	private String memo_3;
		
	//43.メモ4
	private String memo_4;
	
	//44.メモ5
	private String memo_5;
	
	//45.大カテゴリーID
	private String category_id;
	
	//46.中カテゴリーID
	private String subcategory_id;
	
	//47.小カテゴリーID
	private String subcategory_id2;
	
	//48.大カテゴリー名
	private String category_id_name;
	
	//49.中カテゴリー名
	private String subcategory_id_name;
	
	//50.小カテゴリー名
	private String subcategory_id2_name;
	
	//51.ステータス
	private String order_status;
	
	//52.受付スキルID
	private String c_worker_attribute_id;
	
	//53.受付スキル名
	private String c_worker_attribute_name;
	
	//54.受付ユーザーID
	private String c_worker_id;
	
	//55.受付ユーザー名
	private String c_worker_name;
	
	//56.更新日付
	private String order_update_date;
	
	//57.更新時間
	private String order_update_time;
	
	//58.更新者スキルID
	private String u_worker_attribute_id;
	
	//59.更新者スキル名
	private String u_worker_attribte_id;
	
	//60.更新者ID
	private String u_worker_id;
	
	//61.更新者名
	private String u_worker_name;
	
	//62.完了日付
	private String order_complete_date;
	
	//63.完了時間
	private String order_complete_time;
	
	//64.要件UID
	private String acceptance;
	
	//65.チャットUID
	private String chat_user_id;
	
	//66.スレッドID
	private String thread_id;
	
	//67.対応結果カテゴリCD大
	private String result_category_id;
	
	//68.対応結果カテゴリ名大
	private String result_category_name;
	
	//69.対応結果カテゴリCD中
	private String result_subcategory_id;
	
	//70.対応結果カテゴリ名中
	private String result_subcategory_name;
	
	//71.国籍
	private String country_name;
	
	//72.ハンドルネーム
	private String handle_name;
	
	//73.解決フラグ
	private String resolve_flag;
	
	//74.送信元IP
	private String ip_address;
	
	//75.利用デバイス
	private String use_device;
	
	//76.アクセス元ページ
	private String title;
	
	//77.アクセス元URL
	private String url;
	
	//78.メモ2_1
	private String memo2_1;
	
	//79.メモ2_2
	private String memo2_2;
	
	//80.メモ2_3
	private String memo2_3;
	
	//81.メモ2_4
	private String memo2_4;
	
	//82.メモ2_5
	private String memo2_5;
	
	//83.メモ3_1
	private String memo3_1;
	
	//84.メモ3_2
	private String memo3_2;
	
	//85.メモ3_3
	private String memo3_3;
	
	//86.メモ3_4
	private String memo3_4;
	
	//87.メモ3_5
	private String memo3_5;
	
	//88.メモ4_1
	private String memo4_1;
	
	//89.メモ4_2
	private String memo4_2;
	
	//90.メモ4_3
	private String memo4_3;
	
	//91.メモ4_4
	private String memo4_4;
	
	//92.メモ4_5
	private String memo4_5;
	
	//93.メモ2更新日付
	private String memo2_update_date;
	
	//94.メモ3更新日付
	private String memo3_update_date;

	//95.メモ4更新日付
	private String memo4_update_date;
	
	//96.CAREロケーション
	private String care_location;
	
	//97.受付番号
	private String order_number;
	
	//98.分析済フラグ
	private String is_analyzed;
	
	//99.データ登録者ID
	private String data_insert_id;
	
	//100データ登録日時
	private Date data_insert_date;
	
	//101データ更新者ID
	private String data_update_id;
	
	//102データ更新日時
	private Date data_update_date;


	

	
}
