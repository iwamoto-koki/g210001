package jp.co.irs.incident_report_system.Entity;
//FetchData

import java.sql.Timestamp;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter

public class care_try_entry_entity {
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

        //36.受付スキルID
        private String c_worker_attribute_id;

        //37.受付スキル名
        private String c_worker_attribute_name;

        //38.受付ユーザーID
        private String c_worker_id;

        //39.受付ユーザー名
        private String c_worker_name;

        //40.エントリーID
        private String entry_id;

        //41.申込種別
        private String entry_type;

        //42.処理状態
        private String entry_ststus;

        //43.受付システム
        private String entry_acceptsys;

        //44.受付担当者ID
        private String entry_acceptuserid;

        //45.受付担当者名
        private String entry_acceptusername;

        //46.エントリ詳細
        private String entry_detail;

        //47.処理日
        private String dt;

        //48.分析済フラグ
        private String is_analyzed;

        //49.データ登録者ID
        private String data_insert_id;

        //50.データ登録日時
        private Timestamp data_insert_date;

        //51.データ更新者ID
        private String data_update_id;

        //52.データ更新日時
        private Timestamp data_update_date;
}
