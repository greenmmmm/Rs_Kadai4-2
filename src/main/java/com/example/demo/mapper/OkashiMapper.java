package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Okashi;
import com.example.demo.form.SearchForm;


//MyBatisでリポジトリを作成する
@Mapper
public interface OkashiMapper {
	//フォームに入った値を検索。メソッド処理内容は、xmlファイルで記載
	List<Okashi> findBysearchForm(SearchForm searchForm);
}
