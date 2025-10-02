package org.example.tour;

public record Tour(String title, Integer price, Boolean kidFriendly) {
  @Override
  public String toString() {
    return String.format("%s\t$%d\tKid Friendly: %s",
        title(), price(), kidFriendly ? "Yes" : "No");
  }
}