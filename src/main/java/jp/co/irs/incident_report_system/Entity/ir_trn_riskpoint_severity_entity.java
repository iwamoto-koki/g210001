package jp.co.irs.incident_report_system.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class ir_trn_riskpoint_severity_entity {
    //1.共通INDEX
    private long common_index;

    //2.CARE案件ID
    private String case_id;

    //3.ラベル
    private String label;

    //4.スコア
    private BigDecimal score;

    //5.一致文章
    private String matched_window;

    //6.一致キーワード
    private String matched_keywords;

    //7.データ登録者ID
    private String data_insert_id;

    //8.データ登録日時
    private Timestamp data_insert_date;

    //9.データ更新者ID
    private String data_update_id;

    //10.データ更新日時
    private Timestamp data_update_date;    
}
