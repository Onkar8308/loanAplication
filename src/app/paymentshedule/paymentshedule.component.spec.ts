import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaymentsheduleComponent } from './paymentshedule.component';

describe('PaymentsheduleComponent', () => {
  let component: PaymentsheduleComponent;
  let fixture: ComponentFixture<PaymentsheduleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PaymentsheduleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PaymentsheduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
