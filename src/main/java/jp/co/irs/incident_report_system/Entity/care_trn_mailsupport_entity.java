package jp.co.irs.incident_report_system.Entity;

//FetchData

import java.sql.Timestamp;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter

public class care_trn_mailsupport_entity {
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

            //40.更新日時
            private String order_update_date;

            //41.更新時間
            private String order_update_time;

            //42.更新者スキルID
            private String u_worker_attribute_id;

            //43.更新者スキル名
            private String u_worker_attribute_name;

            //44.更新者ID
            private String u_worker_id;

            //45.更新者名
            private String u_worker_name;

            //46.完了日付
            private String order_complete_date;

            //47.完了時間
            private String order_complete_time;

            //48.メールSUBJECT
            private String case_title;

            //49.メールTO
            private String mail_address2;

            //50.メール送信者ID
            private String reqworker_id;

            //51.メール送信者名
            private String reqworker_name;

            //52.メール送信スキルID
            private String reqdept_id;

            //53.メール送信スキル名
            private String reqdept_name;

            //54.メッセージID
            private String message_id;

            //55.問い合わせ内容1
            private String content_1;

            //56.問い合わせ内容2
            private String content_2;

            //57.問い合わせ内容3
            private String content_3;

            //58.問い合わせ内容4
            private String content_4;

            //59.問い合わせ内容5
            private String content_5;

            //60.メール本文1
            private String communi_msg_1;

            //61.メール本文2
            private String communi_msg_2;

            //62.メール本文3
            private String communi_msg_3;

            //63.メール本文4
            private String communi_msg_4;

            //64.メール本文5
            private String communi_msg_5;

            //65.対応内容1
            private String correspondence_1;

            //66.対応内容2
            private String correspondence_2;

            //67.対応内容3
            private String correspondence_3;

            //68.対応内容4
            private String correspondence_4;

            //69.対応内容5
            private String correspondence_5;

            //70.処理履歴
            private String answer;

            //71.処理日
            private String dt;

            //72.分析済フラグ
            private String is_analyzed;

            //73.データ登録者ID
            private String data_insert_id;

            //74.データ登録日時
            private Timestamp data_insert_date;

            //75.データ更新者ID
            private String data_update_id;

            //76.データ更新日時
            private String data_update_date;




}
