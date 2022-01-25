package jp.co.irs.incident_report_system.Entity;

//IncidentReport_採番

import java.sql.Timestamp;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class ir_trn_numbering_entity {
    //1.共通INDEX
    private long common_index;

    //2.データ登録者ID
    private String data_insert_id;

    //3.データ登録日時
    private Timestamp data_insert_date;

    //4.データ更新者ID
    private String data_update_id;

    //5.データ更新日時
    private String data_update_date;    
}
