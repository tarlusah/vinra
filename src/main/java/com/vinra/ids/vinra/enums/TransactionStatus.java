package com.vinra.ids.vinra.enums;

import java.util.ArrayList;
import java.util.List;

public enum TransactionStatus {
    SUCCESS(0, "SUCCESS"),
    FAILED(1, "FAILED");

    private final int id;
    private final String name;

    TransactionStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static List<TransactionStatusDTO> getStatuses() {
        List<TransactionStatusDTO> statuses = new ArrayList<>();
        for (TransactionStatus status : TransactionStatus.values()) {
            statuses.add(new TransactionStatusDTO(status.id, status.name));
        }
        return statuses;
    }

    public static class TransactionStatusDTO {
        private int id;
        private String name;

        public TransactionStatusDTO(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
