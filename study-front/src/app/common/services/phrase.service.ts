import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { ApiResponse } from '../model/api.response';
import { PhraseVo } from '../model/vo/phrase-vo';

@Injectable({
  providedIn: 'root'
})
export class PhraseService {

  constructor(private http: HttpClient) { }

  getPhraseInSentence(sentenceSeq: number): Observable<ApiResponse> {
    return this.http.get<ApiResponse>(`${environment.baseUrl}/phrase/phraseInSentence/${sentenceSeq}`);
  }

  addPhraseInSentence(sentenceSeq: number, phraseVo: PhraseVo): Observable<ApiResponse> {
    return this.http.post<ApiResponse>(`${environment.baseUrl}/phrase/addPhraseInSentence/${sentenceSeq}`, phraseVo);
  }

  deletePhraseByIdInSentence(sentenceSeq: number, phraseId: number): Observable<ApiResponse> {
    return this.http.post<ApiResponse>(`${environment.baseUrl}/phrase/delete/${sentenceSeq}`, phraseId);
  }

  deletePhraseByIds(phraseIds: number[]): Observable<ApiResponse> {
    return this.http.post<ApiResponse>(`${environment.baseUrl}/phrase/delete`, phraseIds);
  }
}