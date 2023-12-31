package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @AllArgsConstructor
// @NoArgsConstructor
// @Builder
// @Getter
// @Setter
// @ToString
// @EqualsAndHashCode
//// 如果唔想比人setter就唔好@Data
@Data // Getter, Setter, ToString, Equals, Hashcode,RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
  private String author;
  private double weight;

}
