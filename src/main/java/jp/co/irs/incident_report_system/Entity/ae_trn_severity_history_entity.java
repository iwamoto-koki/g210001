package jp.co.irs.incident_report_system.Entity;

//分析エンジン＿編集＿重要度

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class ae_trn_severity_history_entity {
    //1.履歴カウント
    private long history_cnt;

    //2.ラベル
    private String label;

    //3.キーワード
    private String keyword;

    //4.スコア
    private BigDecimal score;

    //5.編集コメント
    private String comment;

    //6.データ登録者ID
    private String data_insert_id;

    //7.データ登録日時
    private Timestamp data_insert_date;

    //8.データ更新者ID
    private String data_update_id;

    //9.データ更新日時
    private Timestamp data_update_date;
}
