package com.leo.tranfser.core.domain.account;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.saro.commons.bytes.annotations.FixedData;
import me.saro.commons.bytes.annotations.FixedText;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@FixedData(size = 100)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Account {

    @Id
    @FixedText(offset = 0, length = 10)
    private String id;

    @FixedText(offset = 10, length = 20)
    private String owner;

    @FixedText(offset = 30, length = 70)
    private Double value;

}
