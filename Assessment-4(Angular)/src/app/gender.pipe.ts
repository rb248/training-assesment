import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name: 'gender' })
export class GenderPipe implements PipeTransform {

  transform(value: string, gender: string, status: string) {

    if (gender.toUpperCase() == "MALE") {
      return "MR. " + value;
    }
    else {
      if (status.toUpperCase() == "SINGLE") {
        return "MS. " + value;
      }
      else {
        return "MRS. " + value;
      }

    }

  }

}
