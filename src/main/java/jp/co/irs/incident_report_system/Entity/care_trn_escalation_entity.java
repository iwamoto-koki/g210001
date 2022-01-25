package jp.co.irs.incident_report_system.Entity;
//FetchData

import java.sql.Timestamp;

import lombok.Setter;
import lombok.Getter;



@Setter
@Getter

public class care_trn_escalation_entity {
    
    //1.共通INDEX PK
    private long common_index;

    //2.ブランド　
    private String user_provider_code;

    //3.チャネル
    private String channel_sub1;

    //4.チャネルサブ
    private String channel_sub2;

    //5.CARE案件ID PK
    private String case_id;

    //6.CTS案件ID
    private String request_id;

    //7.種別
    private String order_type;

    //8.種別詳細
    private String business_line;

    //9.CARE親案件ID
    private String relation_case_id;

    //10.登録日付
    private String order_create_date;

    //11.登録時間
    private String order_create_time;

    //12.個人法人区分名称
    private String kojinkb_name;

    //13.カスタマーID
    private String customer_id;

    //14.MSN
    private String msn_nbr;

    //15.サービスID
    private String service_id;

    //16.請求グループID
    private String bill_group_id;

    //17.契約者ID
    private String Contractor_id;

    //18.見込顧客ID
    private String inquiry_id;

    //19.SBTM請求グループID
    private String tm_bill_id;

    //20.課金ID
    private String charge_id;

    //21.BLUU駐車ユーザーID
    private String bluu_parking_user_id;

    //22.BLUU駐車場ユーザー区分
    private String acceptance_type;

    //23.契約者氏名
    private String contractant;

    //24.取次店履歴コード
    private String agency_hist_code;

    //25.取次店コード
    private String agency_code;

    //26.クルーコード
    private String crew_code;

    //27.クルー名
    private String crew_name;

    //28.SB-ID
    private String softbank_systemid;

    //29.キャリアフリーID
    private String cindy_career_free_id;

    //30.大カテゴリID
    private String category_id;

    //31.中カテゴリID
    private String subcategory_id;

    //32.小カテゴリID
    private String subcategory_id2;

    //33.大カテゴリ名
    private String category_id_name;

    //34.中カテゴリ名
    private String subcategory_id_name;

    //35.小カテゴリ名
    private String subcategory_id2_name;

    //36.更新日付
    private String order_update_date;

    //37.更新時間
    private String order_update_time;

    //38.完了日付
    private String order_complete_date;

    //39.完了時間
    private String order_complete_time;

    //40.エスカ元スキルID
    private String esca_team_id_from;

    //41.エスカ元スキル名
    private String esca_team_nm_from;

    //42.エスカ元ユーザーID
    private String c_worker_id;

    //43.エスカ元ユーザー名
    private String c_worker_name;

    //44.エスカ担当スキルID
    private String reqdept_id;

    //45.エスカ担当スキル名
    private String reqdept_name;

    //46.エスカ担当者ID
    private String reqworker_id;

    //47.エスカ担当者名
    private String reqworker_name;

    //48.エスカテゴリID
    private String unique_esca_id;

    //49.エスカテゴリ名
    private String unique_esca_name;

    //50.エスカステータス名
    private String disp_status;

    //51.依頼内容1
    private String cintent_1;

    //52.依頼内容2
    private String content_2;

    //53.依頼内容3
    private String content_3;

    //54.依頼内容4
    private String content_4;

    //55.依頼内容5
    private String Content_5;

    //56.エスカ回答内容1
    private String correspondence_1;

    //57.エスカ回答内容2
    private String correspondence_2;

    //58.エスカ回答内容3
    private String correspondence_3;

    //59.エスカ回答内容4
    private String correspondence_4;

    //60.エスカ回答内容5
    private String correspondence_5;

    //61.処理予定日
    private String due_date;

    //62.処理履歴
    private String answer;

    //63.エスカ回答要否
    private String esca_answer;

    //64.エスカサブステータス
    private String disp_sub_status;

    //65.処理日
    private String dt;

    //66.CAREロケーション
    private String care_location;

    //67.エスカ先スキルID
    private String pre_ass_id;

    //68.エスカ先スキル名
    private String pre_ass_name;

    //69.分析済フラグ
    private String is_analyzed;

    //70.データ登録者ID
    private String data_insert_id;

    //71.データ登録日時
    private Timestamp data_insert_date;

    //72.データ更新者ID
    private String data_update_id;

    //73.データ更新日時
    private Timestamp data_update_date;
}
