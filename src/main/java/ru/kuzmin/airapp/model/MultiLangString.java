package ru.kuzmin.airapp.model;

import lombok.Data;

import java.util.Map;

@Data
public class MultiLangString {
    Map<String, String> value;
}
