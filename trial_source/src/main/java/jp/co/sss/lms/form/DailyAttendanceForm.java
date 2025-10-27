package jp.co.sss.lms.form;

import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 日次の勤怠フォーム
 * 
 * @author 東京ITスクール
 */
@Data
public class DailyAttendanceForm {

	/** 受講生勤怠ID */
	private Integer studentAttendanceId;
	/** 途中退校日 */
	private String leaveDate;
	/** 日付 */
	private String trainingDate;
	/** 出勤時間 */
	private String trainingStartTime;
	/** 退勤時間 */
	private String trainingEndTime;
	/** 中抜け時間 */
	private Integer blankTime;
	/** 中抜け時間（画面表示用） */
	private String blankTimeValue;
	/** ステータス */
	private String status;
	/** 備考 */
	@Size(max = 100, message = "{maxlength}")
	private String note;
	/** セクション名 */
	private String sectionName;
	/** 当日フラグ */
	private Boolean isToday;
	/** エラーフラグ */
	private Boolean isError;
	/** 日付（画面表示用） */
	private String dispTrainingDate;
	/** ステータス（画面表示用） */
	private String statusDispName;
	/** LMSユーザーID */
	private String lmsUserId;
	/** ユーザー名 */
	private String userName;
	/** コース名 */
	private String courseName;
	/** インデックス */
	private String index;
	
	// Task.26 - ザザリン
	/** 出勤時間（時）*/
	private String trainingStartTimeHour;
	/** 出勤時間（分）*/
	private String trainingStartTimeMinute;
	/** 退勤時間（時） */
	private String trainingEndTimeHour;
	/** 退勤時間（分） */
	private String trainingEndTimeMinute;
	
	// Task27
//	public boolean hasStartHour()   { return trainingStartTimeHour != null && !trainingStartTimeHour.isEmpty(); }
//    public boolean hasStartMinute() { return trainingStartTimeMinute != null && !trainingStartTimeMinute.isEmpty(); }
//    public boolean hasEndHour()     { return trainingEndTimeHour != null && !trainingEndTimeHour.isEmpty(); }
//    public boolean hasEndMinute()   { return trainingEndTimeMinute != null && !trainingEndTimeMinute.isEmpty(); }
//
//    public boolean hasStart() { return hasStartHour() && hasStartMinute(); }
//    public boolean hasEnd()   { return hasEndHour()   && hasEndMinute(); }
//
//    /** hh:mm を分に変換（"","null"は null を返す） */
//    public Integer startTotalMinutes() {
//        if (!hasStart()) return null;
//        return Integer.parseInt(trainingStartTimeHour) * 60 + Integer.parseInt(trainingStartTimeMinute);
//    }
//    public Integer endTotalMinutes() {
//        if (!hasEnd()) return null;
//        return Integer.parseInt(trainingEndTimeHour) * 60 + Integer.parseInt(trainingEndTimeMinute);
//    }
//    
//    @AssertTrue(message = "{input.invalid}")
//    public boolean isStartPairValid() {
//      return !(xor(hasStartHour(), hasStartMinute())); // 片側入力なら false
//    }
//
//    @AssertTrue(message = "{input.invalid}")
//    public boolean isEndPairValid() {
//      return !(xor(hasEndHour(), hasEndMinute()));
//    }
//
//    @AssertTrue(message = "{attendance.punchInEmpty}")
//    public boolean isNoEndWithoutStart() {
//      Integer s = startTotalMinutes(), e = endTotalMinutes();
//      return !(s == null && e != null);
//    }
//
//    @AssertTrue(message = "{attendance.trainingTimeRange}")
//    public boolean isEndAfterStart() {
//      Integer s = startTotalMinutes(), e = endTotalMinutes();
//      return !(s != null && e != null && e <= s);
//    }
//
//    @AssertTrue(message = "{attendance.blankTimeError}")
//    public boolean isBlankWithinWork() {
//      Integer s = startTotalMinutes(), e = endTotalMinutes();
//      return !(s != null && e != null && blankTime != null && blankTime > (e - s));
//    }
//
//    private static boolean xor(boolean a, boolean b){ return a^b; }
//	public boolean hasStartHour()   { return nz(trainingStartTimeHour); }
//	  public boolean hasStartMinute() { return nz(trainingStartTimeMinute); }
//	  public boolean hasEndHour()     { return nz(trainingEndTimeHour); }
//	  public boolean hasEndMinute()   { return nz(trainingEndTimeMinute); }
//	  public boolean hasStart()       { return hasStartHour() && hasStartMinute(); }
//	  public boolean hasEnd()         { return hasEndHour()   && hasEndMinute(); }
//
//	  public Integer startTotalMinutes() {
//	    if (!hasStart()) return null;
//	    return Integer.parseInt(trainingStartTimeHour) * 60 + Integer.parseInt(trainingStartTimeMinute);
//	  }
//	  public Integer endTotalMinutes() {
//	    if (!hasEnd()) return null;
//	    return Integer.parseInt(trainingEndTimeHour) * 60 + Integer.parseInt(trainingEndTimeMinute);
//	  }
//	  private boolean nz(String s){ return s != null && !s.isEmpty(); }

}
