package jp.co.irs.incident_report_system.Entity;

//分析エンジン＿編集＿シノニム

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class ae_trn_edit_synonym_entity {
    //1.履歴カウント
    private BigDecimal history_cnt;

    //2.キーワード
    private String keyword;

    //3.シノニム
    private String synonym;

    //4.編集コメント
    private String comment;

    //5.データ登録者ID
    private String data_insert_id;

    //6.データ登録日時
    private Timestamp data_insert_date;

    //7.データ更新者ID
    private String data_update_id;

    //8.データ更新日時
    private Timestamp data_update_date;
}
