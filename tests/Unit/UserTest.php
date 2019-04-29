<?php

namespace Tests\Unit;

use Tests\TestCase;
use Database\factories\UserFactory;
use Illuminate\Foundation\Testing\WithFaker;
use Illuminate\Foundation\Testing\RefreshDatabase;

class UserTest extends TestCase
{
    /**
     * A basic unit test example.
     *
     * @return void
     */
    
    public function test_can_login() {
        $body = [
            'email' => 'n@nmail.com',
            'password' => '123456789'
        ];
        $this->json('POST','/api/auth/login',$body,['Accept' => 'application/json'])
            ->assertStatus(200)
            ->assertJsonStructure(['token_type','access_token']);
    }
    public function test_can_signup(){
        $body = [
            'name' => 'reem',
            'email' => 'reemmm@anymail.com',
            'password' => '123456789',
            'password_confirmation'=>'123456789',
            'gender'=>'female',
            'education'=>'university',
            'interests'=>'none',
            'age'=>'20',
            'skills'=>'none',
            'experience'=>'none'
        ];
        $this->json('POST','/api/auth/signup',$body,['Accept' => 'application/json'])
            ->assertStatus(201);
            

    }
     public function test_can_delete()
     {
        $body = [
           'id'=>'6'
        ];
        $this->json('DELETE','/api/auth/delete/6',$body,['Accept' => 'application/json'])
            ->assertStatus(200);
     }
     public function test_can_get_one_user()
     {
        $body = [
            'id'=>'1'
        ];
        $this->json('GET','/api/auth/displaycertainuser/1',$body,['Accept' => 'application/json'])
            ->assertStatus(200);
     }
     public function test_can_get_all_users()
     { $body = [
       
       ];
        $this->json('GET','/api/auth/displayallusers',$body,['Accept' => 'application/json'])
        ->assertStatus(200);
     }
}
