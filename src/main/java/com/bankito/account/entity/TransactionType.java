package com.bankito.account.entity;

import com.google.gson.annotations.SerializedName;

public enum TransactionType {

  @SerializedName("deposit")
  DEPOSIT(),
  @SerializedName("withdraw")
  WITHDRAW(),
  @SerializedName("transfer")
  TRANSFER()
}
