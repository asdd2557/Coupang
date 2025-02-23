package com.example.coupang.coupon.entity;

import com.example.coupang.user.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@NoArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(length = 255)
    @NotBlank
    private String couponName;

    @Max(100)
    private Long off;

    @NotBlank
    private String status;

    @NotNull
    private LocalDateTime expDate;

    @NotNull
    private Long useCount;

    @NotNull
    private Long maxCount;

    @Version
    private Long version;

    public Coupon(User user, String couponName, Long off, String status, LocalDateTime expDate, Long useCount, Long maxCount){
        this.user = user;
        this.couponName = couponName;
        this.off = off;
        this.status = status;
        this.expDate = expDate;
        this.useCount = useCount;
        this.maxCount = maxCount;
    }

    public Coupon incrementUseCount() {
        this.useCount++; // 발급 수 증가
        return this;
    }
}
