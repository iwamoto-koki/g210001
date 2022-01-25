package jp.co.irs.incident_report_system.Entity;

//分析エンジン_編集ヘッダ

import lombok.Setter;

import java.sql.Timestamp;

import lombok.Getter;

@Setter
@Getter
public class ae_trn_edit_header_entity {
    //1.履歴カウント
    private long history_cnt;

    //2.編集者ID
    private String data_insert_id;

    //3.編集中フラグ
    private boolean edit_flg;

    //4.編集中コメント
    private String comment;

    //5.本番環境登録日
    private Timestamp production_insert_date;

    //6.本番環境登録者ID
    private String production_insert_id;

    //7.データ登録者ID
    //private String data_insert_id;

    //8.データ登録日時
    private Timestamp data_insert_date;

    //9.データ更新者ID
    private String data_update_id;

    //10.データ更新日時
    private String data_update_date;    
}
