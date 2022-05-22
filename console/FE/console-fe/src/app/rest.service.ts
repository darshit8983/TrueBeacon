import { Injectable } from '@angular/core';
import { catchError } from 'rxjs/internal/operators';
import { HttpClient, HttpHeaders, HttpErrorResponse, HttpParams } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { map } from 'rxjs/operators';

export interface Symbols {
  symbol: string;
}

const endpoint = 'http://localhost:4200/tb/';

@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(private http: HttpClient) { }

  private extractData(res: Response): any {
    const body = res;
    return body || { };
  }

  getSymbols(): Observable<any> {
    //console.log(this.http.get<any>(endpoint + 'symbols'))
    return this.http.get<any>(endpoint + 'symbols').pipe(
      catchError(this.handleError)
    );
  }

  getHistData(req : any): Observable<any> {
    let params = new HttpParams();
    params = params.append("symbol", req.instName);
    params = params.append('fromDate', req.fromDate);
    params = params.append('toDate', req.toDate);
    console.log(this.http.get<any>(endpoint + 'historical-data', {params}))
    return this.http.get<any>(endpoint + 'historical-data', {params}).pipe(
      catchError(this.handleError)
    );
  }

  private handleError(error: HttpErrorResponse): any {
    if (error.error instanceof ErrorEvent) {
      console.error('An error occurred:', error.error.message);
    } else {
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    return throwError(
      'Something bad happened; please try again later.');
  }

}
