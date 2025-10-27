//package jp.co.sss.lms.form;
//
//import static java.lang.annotation.ElementType.*;
//import static java.lang.annotation.RetentionPolicy.*;
//
//import java.lang.annotation.Documented;
//import java.lang.annotation.Retention;
//import java.lang.annotation.Target;
//
//import jakarta.validation.Constraint;
//import jakarta.validation.Payload;
//
//@Documented
//@Target(TYPE)
//@Retention(RUNTIME)
//@Constraint(validatedBy = AttendanceRowValidator.class)
//public @interface AttendanceRowValid {
//	String message() default "{input.invalid}";
//	  Class<?>[] groups() default {};
//	  Class<? extends Payload>[] payload() default {};
//
//}


//True Result
//
//<div class="row">
//		<div class="bs-component col-sm-12">
//
//			<form th:action="@{/attendance/update}" method="post">
//				<table class="table table-hover dataTable no-footer table-scroll">
//
//					<thead style="display: block;">
//						<tr>
//							<th class="w140">日付</th>
//							<th class="w140">コース内容</th>
//							<th class="w180" colspan="3">出勤</th>
//							<th class="w180" colspan="3">退勤</th>
//							<th class="w80">中抜け時間</th>
//							<th class="w70">ステータス</th>
//							<th class="w140">備考</th>
//						</tr>
//					</thead>
//					<tbody style="display: block; overflow-y: scroll; height: 560px;">
//						<th:block th:each="dailyAttendanceForm, stat : *{attendanceForm.attendanceList}">
//							
//							<tr>
//
//								<th:block>
//									<input type="hidden" th:name="|attendanceList[${stat.index}].isToday|"
//										th:value="${dailyAttendanceForm.isToday}" />
//									<input type="hidden" th:name="|attendanceList[${stat.index}].studentAttendanceId|"
//										th:value="${dailyAttendanceForm.studentAttendanceId}" />
//									<input type="hidden" th:name="|attendanceList[${stat.index}].trainingDate|"
//										th:value="${dailyAttendanceForm.trainingDate}" />
//									<input type="hidden" th:name="|attendanceList[${stat.index}].dispTrainingDate|"
//										th:value="${dailyAttendanceForm.dispTrainingDate}" />
//									<input type="hidden" th:name="|attendanceList[${stat.index}].sectionName|"
//										th:value="${dailyAttendanceForm.sectionName}" />
//									<input type="hidden" th:name="|attendanceList[${stat.index}].statusDispName|"
//										th:value="${dailyAttendanceForm.statusDispName}" />
//								</th:block>
//								<td class="w140">[[${dailyAttendanceForm.dispTrainingDate}]]</td>
//								<td class="w140">[[${dailyAttendanceForm.sectionName}]]</td>
//								<!--Task.26 - ザザリン-->
//								<td class="w70">
//
//									<select th:name="|attendanceList[${stat.index}].trainingStartTimeHour|"
//										class="form-control">
//										<option th:each="startHour : ${attendanceForm.hourMap}"
//											th:value="${startHour.key}" th:inlne="text" class="form-control"
//											th:selected="${startHour.key == dailyAttendanceForm.trainingStartTimeHour}">
//											[[${startHour.value}]]</option>
//									</select>
//									
//								</td>
//								<td>:</td>
//								<td>
//
//									<select th:name="|attendanceList[${stat.index}].trainingStartTimeMinute|"
//										class="form-control">
//										<option th:each="startMinute : ${attendanceForm.minuteMap}"
//											th:value="${startMinute.key}" th:inlne="text" class="form-control"
//											th:selected="${startMinute.key == dailyAttendanceForm.trainingStartTimeMinute}">
//											[[${startMinute.value}]]</option>
//									</select>
//								</td>
//								<td>
//									<select th:name="|attendanceList[${stat.index}].trainingEndTimeHour|"
//										class="form-control">
//										<option th:each="endHour : ${attendanceForm.hourMap}"
//											th:value="${endHour.key}" th:inlne="text" class="form-control"
//											th:selected="${endHour.key == dailyAttendanceForm.trainingEndTimeHour}">
//											[[${endHour.value}]]</option>
//									</select>
//								</td>
//								<td>:</td>
//								<td>
//									<select th:name="|attendanceList[${stat.index}].trainingEndTimeMinute|"
//										class="form-control">
//										<option th:each="endMinute : ${attendanceForm.minuteMap}"
//											th:value="${endMinute.key}" th:inlne="text" class="form-control"
//											th:selected="${endMinute.key == dailyAttendanceForm.trainingEndTimeMinute}">
//											[[${endMinute.value}]]</option>
//									</select>
//								</td>
//								<td>
//									<select th:name="|attendanceList[${stat.index}].blankTime|" class="form-control">
//										<option th:each="blankTime : ${attendanceForm.blankTimes}"
//											th:value="${blankTime.key}" th:inlne="text" class="form-control"
//											th:selected="${blankTime.key == dailyAttendanceForm.blankTime}">
//											[[${blankTime.value}]]</option>
//									</select>
//
//								</td>
//								<td class="w70">[[${dailyAttendanceForm.statusDispName}]]</td>
//								<td class="w140">
//									
//									<input type="text" th:name="|attendanceList[${stat.index}].note|"
//										th:value="${dailyAttendanceForm.note}" class="form-control"></input>
//										
//										
//
//								</td>
//							</tr>
//						</th:block>
//					</tbody>
//				</table>
//
//				<div class="form-group">
//					<th:block th:if="${session.loginUserDto.role == '0001'}">
//						<a th:href="@{/attendance/detail}" class="btn btn-default">戻る</a>
//					</th:block>
//					<th:block th:if="${session.loginUserDto.role != '0001'}">
//						<input type="submit" value="戻る" name="indexCompany" class="btn btn-default" />
//					</th:block>
//					<input type="submit" value="更新" name="complete" class="btn btn-info"
//						onclick="return confirmUpdate()" />
//				</div>
//			</form>
//		</div>
//	</div>
