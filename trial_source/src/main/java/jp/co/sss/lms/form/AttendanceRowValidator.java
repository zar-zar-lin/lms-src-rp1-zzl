//package jp.co.sss.lms.form;
//
//import jakarta.validation.ConstraintValidator;
//import jakarta.validation.ConstraintValidatorContext;
//
//public class AttendanceRowValidator implements ConstraintValidator<AttendanceRowValid, DailyAttendanceForm> {
//	@Override
//	  public boolean isValid(DailyAttendanceForm row, ConstraintValidatorContext ctx) {
//	    boolean valid = true;
//	    ctx.disableDefaultConstraintViolation();
//
//	    // b) 出勤の時分 片方だけ
//	    if ( (row.hasStartHour() ^ row.hasStartMinute()) ) {
//	      add(ctx, "trainingStartTimeHour", "{input.invalid}", "出勤時間"); valid=false;
//	      add(ctx, "trainingStartTimeMinute", "{input.invalid}", "出勤時間");
//	    }
//
//	    // c) 退勤の時分 片方だけ
//	    if ( (row.hasEndHour() ^ row.hasEndMinute()) ) {
//	      add(ctx, "trainingEndTimeHour", "{input.invalid}", "退勤時間"); valid=false;
//	      add(ctx, "trainingEndTimeMinute", "{input.invalid}", "退勤時間");
//	    }
//
//	    Integer s = row.startTotalMinutes();
//	    Integer e = row.endTotalMinutes();
//
//	    // d) 出勤なしで退勤あり
//	    if (s == null && e != null) {
//	      add(ctx, "trainingEndTimeHour", "{attendance.punchInEmpty}"); valid=false;
//	      add(ctx, "trainingEndTimeMinute", "{attendance.punchInEmpty}");
//	    }
//
//	    // e) 退勤 <= 出勤
//	    if (s != null && e != null && e <= s) {
//	      add(ctx, "trainingEndTimeHour", "{attendance.trainingTimeRange}"); valid=false;
//	      add(ctx, "trainingEndTimeMinute", "{attendance.trainingTimeRange}");
//	    }
//
//	    // f) 中抜け > 勤務時間
//	    if (s != null && e != null && row.getBlankTime() != null && row.getBlankTime() > (e - s)) {
//	      add(ctx, "blankTime", "{attendance.blankTimeError}"); valid=false;
//	    }
//	    return valid;
//	  }
//
//	  private static void add(ConstraintValidatorContext ctx, String field, String tpl, Object... args) {
//	    String msg = java.text.MessageFormat.format(tpl, args);
//	    ctx.buildConstraintViolationWithTemplate(msg).addPropertyNode(field).addConstraintViolation();
//	  }
//
//}
