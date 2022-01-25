package jp.co.irs.incident_report_system.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class ir_mst_search_threshold_entity {
    //1.ラベル
    private String label;

    //2.スコアしきい値
    private BigDecimal threshold_score;

    //3.データ登録者ID
    private String data_insert_id;

    //4.データ登録日時
    private Timestamp data_insert_date;

    //5.データ更新者ID
    private String data_update_id;

    //6.データ更新日時
    private Timestamp data_update;

}
