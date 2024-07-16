package com.ms.email.Dto;

import java.util.UUID;

public record EmailRecordDto(UUID userId, String emailTo, String subject, String Text) {
}
