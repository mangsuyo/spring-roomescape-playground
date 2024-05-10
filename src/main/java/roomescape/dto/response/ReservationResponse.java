package roomescape.dto.response;

import roomescape.domain.Reservation;

public record ReservationResponse(
	long id,
	String name,
	String date,
	String time
) {

	public static ReservationResponse from(Reservation reservation) {
		return new ReservationResponse(
			reservation.getId(),
			reservation.getName(),
			reservation.getDate(),
			reservation.getTime());
	}
}
