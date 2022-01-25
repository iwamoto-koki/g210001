package jp.co.irs.incident_report_system.Entity;

import java.sql.Timestamp;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class ir_trn_riskpoint_category_keyword_entity {
    //1.共通INDEX
    private long common_index;

    //2.CARE案件ID
    private String case_id;

    //3.一致キーワード
    private String matched_keywords;

    //4.データ登録者ID
    private String data_insert_id;

    //5.データ登録日時
    private Timestamp data_insert_date;

    //6.データ更新者ID
    private String data_update_id;

    //7.データ更新日時
    private Timestamp data_update_date;
}
